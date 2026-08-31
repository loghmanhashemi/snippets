/*
Capture an object's state so that you can restore it later, without exposing the object's internal details.
Object
  │
  ├── save state ──→ Memento
  │
  │ ... changes ...
  │
  └── restore ←──── Memento

  Memento is useful for:
    Undo/redo
    Save points in games
    Transaction rollback
    Editor history
    Restoring configuration
    Checkpoints in long-running operations

 */

// Memento
data class EditorMemento(
    val text: String
)

// Originator
class Editor {
    var text: String = ""

    fun save(): EditorMemento {
        return EditorMemento(text)
    }

    fun restore(memento: EditorMemento) {
        text = memento.text
    }
}

// Caretaker
class History {
    private val mementos = mutableListOf<EditorMemento>()

    fun push(memento: EditorMemento) {
        mementos.add(memento)
    }

    fun pop(): EditorMemento? {
        return if (mementos.isNotEmpty()) {
            mementos.removeAt(mementos.lastIndex)
        } else {
            null
        }
    }
}

fun main() {
    val editor = Editor()
    val history = History()

    editor.text = "Hello"
    history.push(editor.save())

    editor.text = "Hello World"
    history.push(editor.save())

    editor.text = "Hello World!"

    println(editor.text)
    // Hello World!

    // Undo
    editor.restore(history.pop()!!)

    println(editor.text)
    // Hello World

    // Undo again
    editor.restore(history.pop()!!)

    println(editor.text)
    // Hello
}
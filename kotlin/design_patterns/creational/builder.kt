class Email private constructor(
    val to: String,
    val subject: String?,
    val message: String?,
    val cc: List<String>,
    val bcc: List<String>,
    val attachments: List<String>
) {

    override fun toString(): String {
        return """
            To: $to
            Subject: $subject
            Message: $message
            CC: $cc
            BCC: $bcc
            Attachments: $attachments
        """.trimIndent()
    }


    class MailBuilder(private val to: String) {

        private var subject: String? = null
        private var message: String? = null
        private val cc = mutableListOf<String>()
        private val bcc = mutableListOf<String>()
        private val attachments = mutableListOf<String>()

        fun subject(subject: String) = apply {
            this.subject = subject
        }

        fun message(message: String) = apply {
            this.message = message
        }

        fun cc(email: String) = apply {
            cc.add(email)
        }

        fun bcc(email: String) = apply {
            bcc.add(email)
        }

        fun attachment(file: String) = apply {
            attachments.add(file)
        }

        fun build(): Email {
            return Email(
                to = to,
                subject = subject,
                message = message,
                cc = cc.toList(),
                bcc = bcc.toList(),
                attachments = attachments.toList()
            )
        }
    }
}

fun main() {
     val email = Email.MailBuilder("alice@example.com")
        .subject("Project Update")
        .message("The project has been completed.")
        .cc("bob@example.com")
        .cc("charlie@example.com")
        .bcc("manager@example.com")
        .attachment("report.pdf")
        .attachment("diagram.png")
        .build()

    println(email)
   
}

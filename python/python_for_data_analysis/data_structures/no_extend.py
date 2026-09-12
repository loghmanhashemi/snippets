all_data = [["John", "Emily", "Michael", "Mary", "Steven"],
            ["Maria", "Juan", "Javier", "Natalia", "Pilar"]]

result = [name for names in all_data for name in names if name.count("a") >= 2]
print(result)
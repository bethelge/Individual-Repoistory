class Solution:
    def interpret(self, command: str) -> str:
        # Replace "()" with "o" and "(al)" with "al"
        return command.replace("()", "o").replace("(al)", "al")

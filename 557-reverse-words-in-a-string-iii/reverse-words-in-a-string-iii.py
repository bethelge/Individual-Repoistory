class Solution:
    def reverseWords(self, s: str) -> str:
        # Split the string into words
        words = s.split(" ")
        # Reverse each word and join them with a space
        return " ".join(word[::-1] for word in words)

class Solution:
    def defangIPaddr(self, address: str) -> str:
        # Use the replace method to substitute '.' with '[.]'
        return address.replace(".", "[.]")

        
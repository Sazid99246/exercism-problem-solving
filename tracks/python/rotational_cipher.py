def rotate(text, key):
    rotated_text = ""
    for letter in text:
        if letter.isalpha():  # Check if the character is a letter
            ascii_offset = 65 if letter.isupper() else 97
            rotated_text += chr((ord(letter) - ascii_offset + key) % 26 + ascii_offset)
        else:
            rotated_text += letter  # Keep non-letter characters unchanged
    return rotated_text

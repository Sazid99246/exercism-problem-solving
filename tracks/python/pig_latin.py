def translate(text):
    tot = ""
    vowels = ["a", "e", "i", "o", "u"]
    vowels_2 = ["a", "e", "i", "o", "u", "y"]

    for word in text.split(" "):
        if word[0] in vowels or word[0] + word[1] == "xr" or word[0] + word[1] == "yt":
            tot += word + "ay"
        else:
            if word[1] in vowels_2:
                if word[0] + word[1] == "qu":
                    tot += word[2:] + word[:2] + "ay"
                else:
                    tot += word[1:] + word[0] + "ay"
            else:
                if word[1] + word[2] == "qu" or word[2] not in vowels_2:
                    tot += word[3:] + word[:3] + "ay"
                else:
                    tot += word[2:] + word[:2] + "ay"
            tot += " "
    return tot.strip()

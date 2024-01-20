def is_anagram(word1, word2):
    word1_lowercase = word1.lower()
    word2_lowercase = word2.lower()
    word1_sorted = ''.join(sorted(word1_lowercase))
    word2_sorted = ''.join(sorted(word2_lowercase))
    return word1_sorted == word2_sorted

def find_anagrams(word, candidates):
    word_lowercase = word.lower()
    anagrams = []
    for candidate in candidates:
        if word_lowercase != candidate.lower() and is_anagram(word_lowercase, candidate.lower()):
            anagrams.append(candidate)
    return anagrams
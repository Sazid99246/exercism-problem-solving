const isAnagram = (word1, word2) => {
    const word1Lower = word1.toLowerCase();
    const word2Lower = word2.toLowerCase();

    if (word1Lower.length == word2Lower.length && word1Lower != word2Lower) {
        const sortedword1 = word1Lower.split("").sort().join("");
        const sortedword2 = word2Lower.split("").sort().join("");
        return sortedword1 == sortedword2;
    }
}

export const findAnagrams = (word, candidates)  => {
    return candidates.filter(candidate => isAnagram(candidate, word));
};
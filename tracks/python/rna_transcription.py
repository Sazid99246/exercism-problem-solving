def to_rna(dna_strand):
    rna_letters = {'G': 'C', 'C': 'G', 'T': 'A', 'A': 'U'}
    rna_strand = ""
    for letter in dna_strand:
        if letter in rna_letters:
            rna_strand += rna_letters[letter]
    return rna_strand


print(to_rna("ACGTGGTCTTAA"))

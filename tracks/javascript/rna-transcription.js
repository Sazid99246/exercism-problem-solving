export const toRna = dnaStrand => {
    let rnaStrand = "";
    for (const dna of dnaStrand) {
        switch (dna) {
            case "G":
                rnaStrand += "C";
                break;
            case "C":
                rnaStrand += "G";
                break;
            case "T":
                rnaStrand += "A";
                break;
            case "A":
                rnaStrand += "U";
                break;
        }
    }
    return rnaStrand;
};

console.log(toRna("ACGTGGTCTTAA"));
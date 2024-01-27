const colorCode = (color:string):Number => {
    return COLORS.indexOf(color);
}

const COLORS = ['black', 'brown', 'red', 'orange', 'yellow', 'green', 'blue', 'violet', 'grey', 'white',];

export function decodedValue(colors: string[]) {
    return Number(colorCode(colors[0]) + "" + colorCode(colors[1]))
}
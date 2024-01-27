const ColorAry =
  [`black`,
    `brown`,
    `red`,
    `orange`,
    `yellow`,
    `green`,
    `blue`,
    `violet`,
    `grey`,
    `white`,] as const // need "as const" for type Color
// not needed for this exercise, but this will disallow passing e.g. 'pink' to constructor
export type Color = typeof ColorAry[number]

// inspired by https://exercism.org/tracks/typescript/exercises/resistor-color-trio/solutions/c6p
const ohms = [
  [1_000_000_000, "giga"],
  [1_000_000, "mega"],
  [1_000, "kilo"],] as const

export function decodedResistorValue([band1, band2, band3]: Color[]) : string {
    let num = ((ColorAry.indexOf(band1) * 10) + ColorAry.indexOf(band2)) * (10 ** ColorAry.indexOf(band3))
  // inspired by https://exercism.org/tracks/typescript/exercises/resistor-color-trio/solutions/c6p
   const [divisor, prefix] = ohms.find(([divisor]) => num >= divisor) ?? [1, ""]
    return `${num / divisor} ${prefix}ohms`
}
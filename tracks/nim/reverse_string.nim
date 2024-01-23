proc reverse*(text: string): string =
  var reversed: string = ""
  for i in countdown(text.len - 1, 0):
    reversed.add(text[i])
  return reversed
//Solution goes in Sources
func append(_ lhs: [Int], _ rhs: [Int]) -> [Int] {
    var result = lhs
    for val in rhs {
        result.append(val)
    }
    return result
}

func concat(_ lists: [Int]...) -> [Int] {
    var result: [Int] = []
    for list in lists {
        result += list
    }
    return result
}

func filter(_ list: [Int], function f: (Int) -> Bool) -> [Int] {
    var result: [Int] = []
    for val in list {
        if f(val) {
            result.append(val)
        }
    }
    return result
}

func length(_ list: [Int]) -> Int {
    var result = 0
    for _ in list {
        result += 1
    }
    return result
}

func map(_ list: [Int], function f: (Int) -> Int) -> [Int] {
    var result: [Int] = []
    for val in list {
        result.append(f(val))
    }
    return result
}

func foldLeft<T>(_ list: ArraySlice<T>, accumulated: T, combine f: (T, T) -> T) -> T {
    if let first = list.first {
        return foldLeft(list.dropFirst(1), accumulated: f(accumulated, first), combine: f)
    } else {
        return accumulated
    }
}

func foldRight<T>(_ list: ArraySlice<T>, accumulated: T, combine f: (T, T) -> T) -> T {
    if let first = list.first {
        return f(first, foldRight(list.dropFirst(1), accumulated: accumulated, combine: f))
    } else {
        return accumulated
    }
}

func reverse(_ list: [Int]) -> [Int] {
    var result = list
    let n = list.count
    let upTo = n / 2
    for i in 0..<upTo {
        let tmp = result[i]
        result[i] = result[n - i - 1]
        result[n - i - 1] = tmp
    }
    return result
}
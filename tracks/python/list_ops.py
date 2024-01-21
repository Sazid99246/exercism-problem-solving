def append(list1, list2):
    for item in list2:
        list1.append(item)
    return list1


def concat(lists):
    result = []
    for list in lists:
        for item in list:
            if item not in result:
                result.append(item)
    return result


def filter(function, list):
    result = []
    for item in list:
        if function(item):
            result.append(item)
    return result


def length(list):
    count = 0
    for item in list:
        count += 1
    return count


def map(function, list):
    result = []
    for item in list:
        result.append(function(item))
    return result


def foldl(function, list, initial):
    acc = initial
    for element in list:
        acc = function(acc, element)
    return acc


def foldr(function, list, initial):
    return foldl(function, list[::-1], initial)


def reverse(list):
    result = []
    for item in list[::-1]:
        result.append(item)
    return result

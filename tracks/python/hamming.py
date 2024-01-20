def distance(strand_a: list[str], strand_b: list[str]) -> int:
    if len(strand_a) != len(strand_b):
        raise ValueError("Strands must be of equal length.")

    return sum([1 for index, _ in enumerate(strand_a) if strand_a[index] != strand_b[index]])

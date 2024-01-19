def answer(question):
    operators = ['plus', 'minus', 'multiplied by', 'divided by']
    question = question.replace('?', '').replace('What is', '').replace(
        'plus', '+').replace('minus', '-').replace('multiplied by', '*').replace('divided by', '/').split()
    if question == []:
        raise ValueError('syntax error')

    question.insert(0, '(')
    question.insert(4, ')')

    alpha = [word.isalpha() for word in question if word not in ('What', 'is')]
    if any(alpha):
        raise ValueError('unknown operation')
    try:
        return eval(' '.join(question))
    except:
        raise ValueError('syntax error')

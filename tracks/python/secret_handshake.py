def commands(binary_str):
    command_list = []
    if binary_str[-1] == '1':
        command_list.append("wink")
    if binary_str[-2] == '1':
        command_list.append('double blink')
    if binary_str[-3] == '1':
        command_list.append('close your eyes')
    if binary_str[-4] == '1':
        command_list.append('jump')
    if binary_str[-5] == '1':
        command_list.reverse()
    return command_list

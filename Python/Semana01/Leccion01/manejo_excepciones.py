from equals_numbers_exception import  equalsNumbersException

result = None


try:
    a = int(input('Enter a number: '))
    b = int(input('Enter another number: '))
    if a == b:
        raise equalsNumbersException('Equals numbers')
    result = a/b
except TypeError as e:
    print(f'TypeError -> Error! something happened: {type(e)}')
except ZeroDivisionError as e:
    print(f'ZeroDivisionError -> Error! something happened: {type(e)}')
except Exception as e:
    print(f'Exception -> Error! something unexpected happened: {type(e)}')
else:
    print('There hasnt been any exception.')
finally:
    print('See you!')
print(f'The result is: {result}')
print('Lets continue...')
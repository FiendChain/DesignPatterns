def repeat(n):
    def decorator(func):
        def wrapped(*args, **kwargs):
            for i in range(n):
                func(*args, **kwargs)
        return wrapped
    return decorator

def repeat_with_prefix(n, formatter):
    def decorator(func):
        def wrapped(*args, **kwargs):
            for i in range(n):
                print('{}: '.format(formatter(i)), end='')
                func(*args, **kwargs)
        return wrapped
    return decorator

def main():
    @repeat_with_prefix(2, lambda n: 'odd' if n % 2 != 0 else 'even')
    @repeat(10)
    def helloWorld(msg):
        print('Hello world: {}'.format(msg))
    
    helloWorld('Tim Shaw')

if __name__ == '__main__':
    main()
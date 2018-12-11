def decorator(func):
    def wrapped(*args, **kwargs):
        print('Starting to wrap \'{}\''.format(func.__name__))
        func(*args, **kwargs)
        print('Ending wrap \'{}\''.format(func.__name__))
    wrapped.__name__ = '{}.wrapped'.format(func.__name__)
    return wrapped

def main():
    @decorator
    @decorator
    def helloWorld():
        print('Hello world')

    helloWorld()

if __name__ == '__main__':
    main()

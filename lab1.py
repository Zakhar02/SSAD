import string


def reverse_string():
    print("Input string:")
    str = input()[::-1]
    print("Reversed string:")
    print(str)
    txt = str.lower()
    for i in txt:
        if i == ' ':
            print("  ")
        else:
            print(string.ascii_lowercase.index(i) + 1, end=' ')


def main():
    reverse_string()


if __name__ == "__main__":
    main()

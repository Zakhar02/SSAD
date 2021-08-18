import string


def reverse_string(str):
    return str[::-1]


def main():
    print("Input string:")
    str = reverse_string(input())
    print("Reversed string:")
    print(str)
    txt = str.lower()
    for i in txt:
        if i == ' ':
            print("  ")
        else:
            print(string.ascii_lowercase.index(i) + 1, end=' ')


if __name__ == "__main__":
    main()

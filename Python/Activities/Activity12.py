#Write a recursive function to calculate the sum of numbers from 0 to 10


def calculate(i):
    if i <= 1:
        return i
    else:
        return i + calculate(i-1)

num = int(input("Enter a number: "))
print("The sum of numbers: ", calculate(num))
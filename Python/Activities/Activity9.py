"""Given a two list of numbers create a new list such that new list should contain only odd 
numbers from the first list and even numbers from the second list."""


listOne = [11, 32, 23, 12, 17]
listTwo = [10, 43, 23, 36, 12]


thirdList = []

# Iterate through first list to get odd elements
for num in listOne:
    if (num % 2 != 0):
        thirdList.append(num)
        
# Iterate through first list to get even elements
for num in listTwo:
    if (num % 2 == 0):
        thirdList.append(num)

print("result List is:")
print(thirdList)
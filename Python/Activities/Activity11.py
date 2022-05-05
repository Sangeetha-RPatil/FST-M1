fruit_shop = {
    "mango": 10,
    "banana": 11,
    "jackfruit": 5,
    "peaches": 15
}

key_to_check = input("What are you looking for? ").lower()

if(key_to_check in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")
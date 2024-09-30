def print_menu_in_two_columns(menu_items):
    # Calculate the maximum width for each column
    col_width = max(len(item) for item in menu_items) + 2

    # Print the menu items in two columns
    for i in range(0, len(menu_items), 2):
        left_item = menu_items[i]
        right_item = menu_items[i + 1] if i + 1 < len(menu_items) else ""
        print(f"{left_item:<{col_width}} {right_item:<{col_width}}")


print("----------OmniShop -  Choose Filter ----------")

count = 1

# print("_________________________________")
# print("|User Name Entered : Harnoor123  |")
# print("|                                |")
# print("|                                |")
# print("|________________________________|")

# ["By ID", "By Contact", "By User Name", "Cancel"]

# strng = ""
# for i in ["Starts With", "Contains", "Ends With","Equals", "Not Equal To", "Doesn't Contains", "Less Than", "Greater Than", "Cancel"]:
#     if count%2!=0:
#         print(f"{count}. {i}")
#         strng = strng + f"{count}. {i} "
#     else:
#         print(f"{count}. {i}")
    
#     count += 1

print_menu_in_two_columns(["Starts With", "Contains", "Ends With","Equals", "Not Equal To", "Doesn't Contains", "Less Than", "Greater Than", "Cancel"])
print("Enter Your Choice: ")
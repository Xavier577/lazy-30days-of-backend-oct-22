# Day 4: Simple Validator

Write a function that takes in 2 strings. The first one is the email address, the second one is the password and returns an object specified below.

Verify that the email adress is valid. If valid, create an object with property "email" and assign as true else, assign as false. For the password verify that it has at least one Uppercase letter, at least one lowercase letter, at least one non-alphanumeric character, at least one number and at least 8 character long. if the password is valid, let the object have property "password" assigned to true else, false.

## Example

```
# Example 1

email = "akinwandeakiboluwarin@gmail.com"
password = "YOucan'tgetmyPassword2"
validate(email, password)

"""
Output

{"email": true, "password": true}
"""

# Example 2

email = "ichigokurosaki@gmail.com"
password = "getsugaTensho"
validate(email, password)

"""
Output

{"email": true, "password": false}
"""

# Example 3

email = "ichigokurosakigmail.com"
password = "getsugaTensho"
validate(email, password)

"""
Output

{"email": false, "password": false}
"""

```

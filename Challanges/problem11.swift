/**
 
 Write a function that accepts a String as its only parameter, and returns true if the string reads the same when reversed, ignoring case.

 * Coded By : Medi W. Assumani
 * Language : Swift
 * Program Name : Palindrome

 */
import Foundation

func isPalindrome(string: String) -> Bool{
    let lowerCasedInput = string.lowercased()
    return lowerCasedInput.reversed().elementsEqual(lowerCasedInput)
}

print(isPalindrome(string: "rotator"))
print(isPalindrome(string: "Hello, world"))
print(isPalindrome(string: "Rats live on no evil star"))

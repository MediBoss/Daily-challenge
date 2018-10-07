/*
You need to list some numbers in an alternative order. You need to print all of the numbers from 1 to N. But they can not be in order!

For example: 

N = 3 // Prints: 132
N = 4 // Prints: 1324
N = 5 // Prints: 13245

// These are wrong
N = 3 // Prints: 123 <- in order 
N = 4 // Prints: 1423 <- 2 and 3 are in order
N = 5 // Prints: 54321 <- Backwards is not acceptable!

*/

func turnNumberIntoList(number: Int) -> [Int]{
    var counter = number/number
    var tempList = [Int]()
    while counter <= number{
        tempList.append(counter)
        counter += 1
    }
    
    return tempList
}


func unOrderedNumbers(number: Int) -> [Int]{
    
    var sortedList = turnNumberIntoList(number: number)
    var listToBeReturned = [Int]()
    var min = 0
    var max = number - 1
    
    while(min < max){
        listToBeReturned.append(sortedList[min])
        min += 1
        listToBeReturned.append(sortedList[max])
        max -= 1
    }
    
    if number % 2 == 1 {
        //print(sortedList[min])
        listToBeReturned.append(sortedList[min])
    }
    
    listToBeReturned.swapAt(1, number - 1)
    return listToBeReturned
}

print(unOrderedNumbers(number: 5))



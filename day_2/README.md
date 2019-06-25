# Akamai Krakow Devoxx Competition - 2019

Welcome to the Akamai Krakow Devoxx Competition 2019. Here you will find
all information on how to participate and submit your solutions. This
repository also contains tasks to be solved.

## Tasks
* each day we will provide tasks at 9:00 CEST time
* there are 5 tasks - 3 x easy, 1 x medium, 1 x hard
* at the end of day we will close the submission and evaluate solutions

## Prizes
The prizes can be gathered from Akamai booth each day.

## Evaluation
Solutions will be evaluated for
* correctness
* performance

If your solution fails correctness, it will not be evaluated by performance test.

For correctness you will receive points as follows:

|easy |medium |hard|
|:---:|:---:|:---:|
|10 |30 |50 |

For performance you will receive additional points depending on
performance ranking


## Rules
* edit existing .java files
* use plain Java Coretto 11.0.3.7.1
* all solutions shall be done as main java app taking arguments from
  command lines and printing results to stdout
* keep the conventions of printouts, print only the solution to the
  stdout
* do not use precomputed solutions - it will be disqualified
* do not pass the solution to other users, remember that it's about fun
  and healthy competition :)

## Assignment 1 - easy
Write a program that calculates number of palindromes in text file. File format is, each word in new single
line. Words are unique in the file.

## Assignment 2 - easy
Write a program that calculates sum of ASCII chars from string. Chars
will be only basic ascii range 0-127.

## Assignment 3 - easy
Write a program that calculates n-th [Fibonnacci](https://en.wikipedia.org/wiki/Fibonacci_sequence) sequence number.
Note - assume 1st element is "1".

## Assignment 4 - medium
Write a program that calculates sum of digits of n-th element of [Look-and-say](https://en.wikipedia.org/wiki/Look-and-say_sequence) sequence.

Note - assume 1st element is "1".

## Assignment 5 - hard
Write program that returns n-th [Vampire Number](https://en.wikipedia.org/wiki/Vampire_number).

# 2nd Day Assignments

## Assignment 6 - hard
Write a program that for given number N prints result of XORing elements of the set [7, N] as decimal integer.

### Input: 
    * N - integer number [7, 1000000000000000000000]

### Example outputs:
    for n = 7, program should print 7
    for n = 10, program should print decimal result of the following operation: 7 XOR 8 XOR 9 XOR 10

## Assignment 7 - easy

Write a program that counts strings separated by comma (,) in given string. It should be noted, that
comma (,) can be escaped by slash (/) i.e. (/,) and double slash (//) represents slash.

### Input:
    * string
    
#### Example outputs:
    for string "a,b/,c" should print 2
    for string "a//b" should print 1

## Assigment 8 - easy
Write a program that for given number N counts number of bits set to 1 in the range [0, N] where numbers
are represented as strings.

### Input: 
    * N - integer number [0, 2^31]
    
### Example output:
    for N = 1 should print 5
    for N = 2 should print 8
# Khwarizmi

# Stripe Problem

Problem description:
Given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
For example, given A = [3, 4, -1, 1], the function should return 2.
For another example, given A = [1, 2, 0], the function should return 3.
Assume that:
N is an integer within the range [1..100,000]; each element of array A is an integer within the range [−1,000,000..1,000,000]. Complexity:
expected worst-case time complexity is O(N); expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments). Elements of input arrays can be modified.

Solution:
1- Separate the positive integer of array to the negative.
2- Cache positive integer into a new array.
3- Mark the smallest positive integer greater than O.
4- Return the smallest positive integer.

Testing:
1- Create a simple java application from your common ide (Netbean or Eclipse) name Solution.
2- Copy my java class solution then run your test case.

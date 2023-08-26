"""You are given n words. Some words may repeat. For each word, output its number of occurrences. The output order should correspond 
with the input order of appearance of the word. See the sample input/output for clarification.

Note: Each input line ends with a "\n" character.
Input Format

The first line contains the integer,n .
The next n lines each contain a word.

Output Format
Output 2 lines.
On the first line, output the number of distinct words from the input.
On the second line, output the number of occurrences for each distinct word according to their appearance in the input.

Sample Input
4
bcdef
abcdefg
bcde
bcdef

Sample Output
3
2 1 1

Explanation
There are 3 distinct words. Here, "bcdef" appears twice in the input at the first and last positions. The other words appear once each.
The order of the first appearances are "bcdef", "abcdefg" and "bcde" which corresponds to the output.
"""
#Program starts here
# Enter your code here. Read input from STDIN. Print output to STDOUT
n=int(input())
dic={}
while(n>0):
    inp=input()
    if inp in dic.keys():
        dic[inp]+=1
    else:
        dic[inp]=1
    n=n-1 
print(len(dic))
for value in dic.values():
    print(value,end=" ")

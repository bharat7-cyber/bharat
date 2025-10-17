class Solution:
    def maxPartitionsAfterOperations(self, s, k):
        def get_partitions(s, k):
            n = len(s)
            partitions = 0
            i = 0
            while i < n:
                freq = [0] * 26
                distinct = 0
                j = i
                while j < n:
                    idx = ord(s[j]) - ord('a')
                    if freq[idx] == 0:
                        distinct += 1
                    freq[idx] += 1
                    if distinct > k:
                        break
                    j += 1
                partitions += 1
                i = j
            return partitions

        n = len(s)
        max_partitions = get_partitions(s, k)

        for i in range(n):
            original = s[i]
            for c in 'abcdefghijklmnopqrstuvwxyz':
                if c == original:
                    continue
                new_s = s[:i] + c + s[i+1:]
                parts = get_partitions(new_s, k)
                if parts > max_partitions:
                    max_partitions = parts

        return max_partitions



sol = Solution()
print(sol.maxPartitionsAfterOperations("accca", 2))  
print(sol.maxPartitionsAfterOperations("aabaab", 3)) 
print(sol.maxPartitionsAfterOperations("xxyz", 1))   

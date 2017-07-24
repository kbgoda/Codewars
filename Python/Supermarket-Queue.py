# Author: Karan Goda
# https://www.codewars.com/kata/57b06f90e298a7b53d000a86
def queue_time(customers, n):
    # e.g. customers = [12, 13]
    queues = []
    if customers is [] or n <= 0:
        return 0
    elif n >= 1:
        # E.g. for 3 queues (n = 3), value would be (0, 0, 0)
        [queues.append(0) for queue in range(n)]
        for customer in customers:
            minQueue = min(queues)
            queues[queues.index(minQueue)] += customer
        return max(queues)

# Test cases
print(queue_time([1, 2, 3], 1)) # Ans is 3
print(queue_time([1, 2, 3], 2)) # Ans is 3
print(queue_time([1, 2, 3, 5], 3)) # Ans is 6

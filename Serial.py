import time
print("Start")
def Testcase1():
    time.sleep(1)
def Testcase2():
    time.sleep(2)
def Testcase3():
    time.sleep(3)
def Testcase4():
    time.sleep(4)
start_time = time.time()
Testcase1()
Testcase2()
Testcase3()
Testcase4()
end_time = time.time()
print("total time for all testcases are  ",round(end_time-start_time), "seconds", "\nDone")


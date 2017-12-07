import time
print("Start")
def Testcase1():
    start_time = time.time()
    print("Test case 1")
    time.sleep(1)
    end_time = time.time()
    print("total time for test case1 ",round(end_time-start_time))
    return
def Testcase2():
    start_time = time.time()
    print("Test case 2")
    time.sleep(2)
    end_time = time.time()
    print("total time for test case2 ",round(end_time-start_time))
    return
def Testcase3():
    start_time = time.time()
    print("Test case 3")
    time.sleep(3)
    end_time = time.time()
    print("total time for test case3 ",round(end_time-start_time))
    return
def Testcase4():
    start_time = time.time()
    print("Test case 4")
    time.sleep(4)
    end_time = time.time()
    print("total time for test case4 ",round(end_time-start_time))
    return
start_time = time.time()
t1 = Testcase1()
t2 = Testcase2()
t3 = Testcase3()
t4 = Testcase4()
end_time = time.time()
print("total time for all testcases ",round(end_time-start_time), "seconds")
print("Done")


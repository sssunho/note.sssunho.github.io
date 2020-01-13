"""
테스트 메서드 호출하기
먼저 setUp 호출하기
나중에 tearDown 호출하기
테스트 메서드가 실패하더라도 tearDown 호출하기
여러 개의 테스트 실행하기
수집된 결과를 출력하기
"""


class TestCase:
    def __init__(self, name):
        self.name = name

    def setup(self):
        pass

    def run(self):
        self.setup()
        method = getattr(self, self.name)
        method()


class WasRun(TestCase):
    def __init__(self, name):
        TestCase.__init__(self, name)

    def setup(self):
        self.wasRun = None
        self.wasSetUp = 1

    def test_method(self):
        self.wasRun = 1


class TestCaseTest(TestCase):
    def test_running(self):
        test = WasRun('test_method')
        test.run()
        assert test.wasRun

    def test_setup(self):
        test = WasRun('test_method')
        test.run()
        assert test.wasSetUp


if __name__ == '__main__':
    TestCaseTest('test_running').run()
    TestCaseTest('test_setup').run()

    # test = WasRun('test_method')
    # print(test.wasRun)
    # test.run()  # 진짜 인터페이스
    # print(test.wasRun)

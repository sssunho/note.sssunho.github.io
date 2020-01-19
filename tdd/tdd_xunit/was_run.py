"""
[O] 테스트 메서드 호출하기
[O] 먼저 setUp 호출하기
[O] 나중에 tearDown 호출하기
[] 테스트 메서드가 실패하더라도 tearDown 호출하기
[O] 여러 개의 테스트 실행하기
[O] 수집된 결과를 출력하기
[O] wasRun에 로그 문자열 남기기
[O] 실패한 테스트 보고하기
[] setup 에러를 잡아서 보고하기
[] TestCase 클래스에서 TestSuite 생성하기
"""


class TestCase:
    def __init__(self, name):
        self.name = name

    def setup(self):
        pass

    def run(self, result):
        result.test_started()

        self.setup()
        try:
            method = getattr(self, self.name)
            method()
        except:
            result.test_failed()
        self.teardown()

    def teardown(self):
        pass


class WasRun(TestCase):
    def __init__(self, name):
        TestCase.__init__(self, name)

    def setup(self):
        self.log = 'setup '

    def test_method(self):
        self.log = self.log + 'test_method '

    def teardown(self):
        self.log = self.log + 'teardown '

    def test_broken_method(self):
        raise Exception


class TestResult:
    def __init__(self):
        self.runCount = 0
        self.failureCount = 0

    def test_started(self):
        self.runCount += 1

    def test_failed(self):
        self.failureCount += 1

    def summary(self):
        return '{} run, {} failed'.format(self.runCount, self.failureCount)


class TestSuite:
    def __init__(self):
        self.tests = []

    def add(self, test):
        self.tests.append(test)

    def run(self, result):
        for test in self.tests:
            test.run(result)


class TestCaseTest(TestCase):
    def setup(self):
        self.result = TestResult()

    def test_template_method(self):
        test = WasRun('test_method')
        test.run(self.result)
        assert 'setup test_method teardown ' == test.log

    def test_result(self):
        test = WasRun('test_method')
        test.run(self.result)
        assert '1 run, 0 failed' == self.result.summary()

    def test_failed_result(self):
        test = WasRun('test_broken_method')
        test.run(self.result)
        assert '1 run, 1 failed' == self.result.summary()

    def test_failed_result_formatting(self):
        result.test_started()
        result.test_failed()
        assert '1 run, 1 failed' == self.result.summary()

    def test_suite(self):
        suite = TestSuite()
        suite.add(WasRun('test_method'))
        suite.add(WasRun('test_broken_method'))

        #: 호출하는 곳에서 TestResults를 할당하는 전략
        # run()이 명시적으로 반환하지 않아도 된다는 장점이 있음
        suite.run(self.result)
        assert '2 run, 1 failed' == self.result.summary()


if __name__ == '__main__':
    suite = TestSuite()
    suite.add(TestCaseTest('test_template_method'))
    suite.add(TestCaseTest('test_result'))
    suite.add(TestCaseTest('test_failed_result_formatting'))
    suite.add(TestCaseTest('test_failed_result'))
    suite.add(TestCaseTest('test_suite'))
    result = TestResult()
    suite.run(result)
    print(result.summary())

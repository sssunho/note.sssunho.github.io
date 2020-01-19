"""
[O] 테스트 메서드 호출하기
[O] 먼저 setUp 호출하기
[O] 나중에 tearDown 호출하기
[] 테스트 메서드가 실패하더라도 tearDown 호출하기
[] 여러 개의 테스트 실행하기
[O] 수집된 결과를 출력하기
[O] wasRun에 로그 문자열 남기기
[O] 실패한 테스트 보고하기
"""


class TestCase:
    def __init__(self, name):
        self.name = name

    def setup(self):
        pass

    def run(self):
        result = TestResult()
        result.test_started()

        self.setup()
        try:
            method = getattr(self, self.name)
            method()
        except:
            result.test_failed()
        self.teardown()

        return result

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


class TestCaseTest(TestCase):
    def test_template_method(self):
        test = WasRun('test_method')
        test.run()
        assert 'setup test_method teardown ' == test.log

    def test_result(self):
        test = WasRun('test_method')
        result = test.run()
        assert '1 run, 0 failed' == result.summary()

    def test_failed_result(self):
        test = WasRun('test_broken_method')
        result = test.run()
        assert '1 run, 1 failed' == result.summary()

    def test_failed_result_formatting(self):
        result = TestResult()
        result.test_started()
        result.test_failed()
        assert '1 run, 1 failed' == result.summary()


if __name__ == '__main__':
    TestCaseTest('test_template_method').run()
    TestCaseTest('test_result').run()
    TestCaseTest('test_failed_result_formatting').run()
    TestCaseTest('test_failed_result').run()

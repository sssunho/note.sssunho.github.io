"""
[O] 테스트 메서드 호출하기
[O] 먼저 setUp 호출하기
[O] 나중에 tearDown 호출하기
[] 테스트 메서드가 실패하더라도 tearDown 호출하기
[] 여러 개의 테스트 실행하기
[] 수집된 결과를 출력하기
[O] wasRun에 로그 문자열 남기기
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
        # self.wasRun = 1

    def teardown(self):
        self.log = self.log + 'teardown '


class TestCaseTest(TestCase):
    def test_template_method(self):
        test = WasRun('test_method')
        test.run()
        assert 'setup test_method teatdown ' == test.log


if __name__ == '__main__':
    TestCaseTest('test_template_method')
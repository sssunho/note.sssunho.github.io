```shell
from datetime import datetime
import logging.handlers

# 로거 인스턴스를 만든다
logger = logging.getLogger('mylogger')

# 포매터를 만든다
fomatter = logging.Formatter('[%(levelname)s|%(filename)s:%(lineno)s] %(asctime)s \n> %(message)s\n')

udate = str(datetime.utcnow().strftime('%Y%m%d%H%M%S'))
filename = '../logs/' + udate + '.log'

# 환경변수를 읽어서 로깅 레벨과 로그를 남길 파일의 경로를 변수에 저장한다
# if (os.environ['NODE_ENV'] == 'local'):
#     loggerLevel = logging.DEBUG
#     filename = '/tmp/test.log'
# elif(os.environ['NODE_ENV'] == 'test'):
#     loggerLevel = logging.DEBUG
#     filename = '/home/www/log/testServer.log'
# else:
#     loggerLevel = logging.INFO
#     filename = '/home/www/log/server.log'


# 스트림과 파일로 로그를 출력하는 핸들러를 각각 만든다.
# fileHandler = logging.FileHandler(filename)
fileMaxByte = 1024 * 1024 * 100  # 100MB
fileHandler = logging.handlers.RotatingFileHandler(filename, maxBytes=fileMaxByte, backupCount=1000)
streamHandler = logging.StreamHandler()

# 각 핸들러에 포매터를 지정한다.
fileHandler.setFormatter(fomatter)
streamHandler.setFormatter(fomatter)

# 로거 인스턴스에 스트림 핸들러와 파일핸들러를 붙인다.
logger.addHandler(fileHandler)
logger.addHandler(streamHandler)

# 로거 인스턴스로 로그를 찍는다.
logger.setLevel(logging.DEBUG)
logger.debug("===========================")
logger.info("TEST START")
logger.warning("파일 명과 로깅 레벨을 각각 환경마다 다르게 남도록 했어요.")
logger.debug("디버그 로그는 테스트 환경과 로컬 피씨에서남 남는 답니다.")
logger.critical("치명적인 버그는 꼭 파일로 남기기도 하고 메일로 발송하세요!")
logger.debug("===========================")
logger.info("TEST END!")

```

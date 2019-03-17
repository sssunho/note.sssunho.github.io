# opencv 설치 시 에러 발생

```shell
cmake -D CMAKE_BUILD_TYPE=RELEASE \
    -D CMAKE_INSTALL_PREFIX=/usr/local \
    -D OPENCV_EXTRA_MODULES_PATH=~/Development/opencv_contrib/modules \
    -D PYTHON3_LIBRARY=YYY \
    -D PYTHON3_INCLUDE_DIR=ZZZ \
    -D PYTHON3_EXECUTABLE=$VIRTUAL_ENV/bin/python \
    -D BUILD_opencv_python2=OFF \
    -D BUILD_opencv_python3=ON \
    -D INSTALL_PYTHON_EXAMPLES=ON \
    -D INSTALL_C_EXAMPLES=OFF \
    -D BUILD_EXAMPLES=ON ..
    
ls /usr/local/Cellar/python3/3.*/Frameworks/Python.framework/Versions/3.6/lib/python3.6/config-3.6m-darwin/libpython3.6.dylib /usr/local/Cellar/python3/3.6.2/Frameworks/Python.framework/Versions/3.6/lib/python3.6/config-3.6m-darwin/libpython3.6.dylib

ls -d /usr/local/Cellar/python3/3.*/Frameworks/Python.framework/Versions/3.6/include/python3.6m/ /usr/local/Cellar/python3/3.6.2/Frameworks/Python.framework/Versions/3.6/include/python3.6m/


/usr/local/Cellar/python3/3.6.2/Frameworks/Python.framework/Versions/3.6/lib/python3.6/config-3.6m-darwin/libpython3.6.dylib@

/usr/local/Cellar/python3/3.6.2/Frameworks/Python.framework/Versions/3.6/include/python3.6m/

cmake -D CMAKE_BUILD_TYPE=RELEASE \
    -D CMAKE_INSTALL_PREFIX=/usr/local \
    -D OPENCV_EXTRA_MODULES_PATH=~/Development/opencv_contrib/modules \
    -D PYTHON3_LIBRARY=/usr/local/Cellar/python3/3.6.2/Frameworks/Python.framework/Versions/3.6/lib/python3.6/config-3.6m-darwin/libpython3.6.dylib \
    -D PYTHON3_INCLUDE_DIR=/usr/local/Cellar/python3/3.6.2/Frameworks/Python.framework/Versions/3.6/include/python3.6m/ \
    -D PYTHON3_EXECUTABLE=$VIRTUAL_ENV/bin/python \
    -D BUILD_opencv_python2=OFF \
    -D BUILD_opencv_python3=ON \
    -D INSTALL_PYTHON_EXAMPLES=ON \
    -D INSTALL_C_EXAMPLES=OFF \
    -D BUILD_EXAMPLES=ON ..

```

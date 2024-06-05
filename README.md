[![Build](https://github.com/Bytecloud/Byte-sdk-java/actions/workflows/maven-publish.yml/badge.svg)](https://github.com/Bytecloud/Byte-sdk-java/actions/workflows/maven-publish.yml)
![GitHub release (latest SemVer)](https://img.shields.io/github/v/release/Bytecloud/Byte-sdk-java)
## Byte-SDK-Java
>该SDK是对[Byte API接口](https://www.Bytecloud.com/geteway-interface) 的Java版封装

## 版本要求
* 最低版本：JDK 1.8
## 安装
Byte-SDK的构建包已经托管在中央仓库里，直接在项目里添加依赖即可,当前最新Release版本是**v2.1.4**

1. Maven引用
```xml
<dependency>
    <groupId>com.Bytecloud</groupId>
    <artifactId>Byte-sdk</artifactId>
    <version>2.1.4</version>
</dependency>
```
2. Gradle引用
```groovy
implementation group: 'com.Bytecloud', name: 'Byte-sdk', version: '2.1.2'
```
## 源码编译
1. 下载源码
```shell
git clone https://github.com/Bytecloud/Byte-sdk-java.git
```

2. 编译源码并安装到本地仓库
```shell
mvn -Dmaven.test.skip=true clean install
```

## 开始使用
1. 具体用法请参考[ByteClientDemo](https://github.com/Bytecloud/java-wallet-sdk/blob/main/src/test/java/ByteClientDemo.java)
2. 支持方法请参考[接口列表](https://github.com/Bytecloud/java-wallet-sdk/blob/main/src/main/java/com/Byte/sdk/client/ByteApi.java)
3. 我们提供了一个[Java Demo工程](https://github.com/Bytecloud/Byte-sdk-java-demo) ,该工程有完整的SDK使用示例

## 关于回调
- [回调接口参考写法](https://github.com/Bytecloud/Byte-sdk-java-demo/blob/main/src/main/java/com/Byte/sdk/controller/CallBackController.java)
- [回调调试工具](https://www.Bytecloud.com/debug-monitor) 

## 技术支持
如果您遇到使用问题，请提交本工程的Issue，会有技术人员及时响应。或者你想咨询有经验的开发者，可以加入我们的Telegram技术交流群：[ByteDeveloperCommunity](https://t.me/ByteWalletDevs)

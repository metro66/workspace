三种不同类型架构的CPU使用的libstlport_shared.so、libsqlcipher_android.so、libdatabase_sqlcipher.so文件相同

$ sha256sum.exe x86/*
74fcf693fdc25240126588a044fcc46ecf59a827aee74e23d95a0cdbd1c11952 *libGNaviData.so
fa2cc3aee405af2ca1d6edeaf000ec103711329ad39f8b4e0d0ea9c91480ddd5 *libGNaviMap.so
5d7dc211cfc221937394d813b9a9d3764d539b8a864a6927ee0d5f5f47468043 *libGNaviMapex.so
9fc8be6c729b4b71c2829daf2768e17a0b24a447406fbebc57c145f9c1d4593c *libGNaviSearch.so
f542013fb8e6d39a5ddf64f8193bd40b225420bbacc72c785fb56c4dc019c6b1 *libGNaviUtils.so
f8fe566808883463863b2258a912b4c89b2df94bedfc82f272289a364ca6e196 *libMobGIS.so
78f55a28f832d3959af4fbc377acbdce745704543abc24c7dd7b55d964a77fb5 *libRoadLineRebuildAPI.so
e88b9410abf9eb62a968dec41c9d69cfefb193524a56e14d61e1f3715205c94d *libdatabase_sqlcipher.so
d64320c37b53e7ab88384cc6be73e1e21c1e7507501ec183c7d8c30bfac9a5c6 *libmsc.so
d8d46e65d96c5765e5eab01780085c1de83d760be0de741d662c9b858f42c8c3 *libsqlcipher_android.so
76f8d5c7c80b72793e71b81790c6337a0d72cc64ff68339fc7da87d0b3a61fa2 *libstlport_shared.so

$ sha256sum.exe armeabi/*
f0a0298811c3b8dbb233f6ddfe8ace9b0757b1550b61c57ec62a37ca45645b8d *armeabi/libGNaviData.so
d86b058a96adbd5e1d1ab4999d36ac39f589b20ff71ece22f599c1e901862936 *armeabi/libGNaviMap.so
91765b50a569f3ff7bc67fa54d7857c6e005e29db4109eac21208a697a69ecb9 *armeabi/libGNaviMapex.so
971ecede6e4684f7e03e04f50a22c18424bea0054f5f257677a0315800057471 *armeabi/libGNaviSearch.so
35621341572e6f8d2e18105de70995152fb8049fb205ae97fffae0573b7a059e *armeabi/libGNaviUtils.so
0a64843461e8e3dc1053e0b336adec434f191149ce51ebdc475d6dea97177e71 *armeabi/libMobGIS.so
dc4fbb2b22fbb0020be61de570e06e1593d33b84fa977009e37ef4d0fbb8df93 *armeabi/libRoadLineRebuildAPI.so
e88b9410abf9eb62a968dec41c9d69cfefb193524a56e14d61e1f3715205c94d *armeabi/libdatabase_sqlcipher.so
15ebba876c65ef92d1e5197caaa6b53038deaadc55e884251760eda046689827 *armeabi/libmsc.so
d8d46e65d96c5765e5eab01780085c1de83d760be0de741d662c9b858f42c8c3 *armeabi/libsqlcipher_android.so
76f8d5c7c80b72793e71b81790c6337a0d72cc64ff68339fc7da87d0b3a61fa2 *armeabi/libstlport_shared.so

$ sha256sum.exe armeabi-v7a/*
0394c74ae5e74d89a0710e5c5668f450b09198aa13939712f2b5a7772a90582d *armeabi-v7a/libGNaviData.so
f2dfec5c50c84fab4ef5eea600ac8fa969041fb2bd7fe7dc328efddc56a47b9d *armeabi-v7a/libGNaviMap.so
6260283a22b6d11808b2fd7d8a1a83d63b25dfb69a98e4a9038eed9ec1be13d4 *armeabi-v7a/libGNaviMapex.so
94e7b22aeec1df1eac87aedf70176ef9eebff9d1a164194d69e5b7f1c2f85021 *armeabi-v7a/libGNaviSearch.so
2cc8c30f948f76941c4ca0465b06da30c1363304321ce3fff20777181bc81d17 *armeabi-v7a/libGNaviUtils.so
360e340e75d3cb65b8c744c427a4dbd1b36018240a7659f32fe17587f50ab969 *armeabi-v7a/libMobGIS.so
9b234784c9646b5a68126341ce4198cc3558282b12d870da6491f097865b39bf *armeabi-v7a/libRoadLineRebuildAPI.so
e88b9410abf9eb62a968dec41c9d69cfefb193524a56e14d61e1f3715205c94d *armeabi-v7a/libdatabase_sqlcipher.so
1958da9ee5c630869d696bd13b5720a0b74f5fbe2ffbeb65c876d4cc98bada72 *armeabi-v7a/libmsc.so
d8d46e65d96c5765e5eab01780085c1de83d760be0de741d662c9b858f42c8c3 *armeabi-v7a/libsqlcipher_android.so
76f8d5c7c80b72793e71b81790c6337a0d72cc64ff68339fc7da87d0b3a61fa2 *armeabi-v7a/libstlport_shared.so


$ file  x86/*
x86/libGNaviData.so:          ELF 32-bit LSB shared object Intel 80386, version 1 (SYSV), dynamically linked, BuildID[sha1]=38ecfeeab156992147ff714c4cb9de52cd8a1b2b, stripped
x86/libGNaviMap.so:           ELF 32-bit LSB shared object Intel 80386, version 1 (SYSV), dynamically linked, BuildID[sha1]=5fe69f63f1a4a28e1daf4a4b7ff1ad5e059d6112, stripped
x86/libGNaviMapex.so:         ELF 32-bit LSB shared object Intel 80386, version 1 (SYSV), dynamically linked, BuildID[sha1]=f32c550d74c5d258ab5e1354ca5a982efca8d9fe, stripped
x86/libGNaviSearch.so:        ELF 32-bit LSB shared object Intel 80386, version 1 (SYSV), dynamically linked, BuildID[sha1]=cc0cd93021b8b83fb8dcfb8b01898d91fefd370b, stripped
x86/libGNaviUtils.so:         ELF 32-bit LSB shared object Intel 80386, version 1 (SYSV), dynamically linked, BuildID[sha1]=1fc896b7818862737f19902cc6706635358eb4fd, stripped
x86/libMobGIS.so:             ELF 32-bit LSB shared object Intel 80386, version 1 (SYSV), dynamically linked, stripped
x86/libRoadLineRebuildAPI.so: ELF 32-bit LSB shared object Intel 80386, version 1 (SYSV), dynamically linked, BuildID[sha1]=dbdb1e72b72a5cff2aaf1dec1016d0696f3853f5, stripped
x86/libdatabase_sqlcipher.so: ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, stripped
x86/libmsc.so:                ELF 32-bit LSB shared object Intel 80386, version 1 (SYSV), dynamically linked, stripped
x86/libsqlcipher_android.so:  ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, stripped
x86/libstlport_shared.so:     ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, interpreter /system/bin/linker, stripped

$ file.exe armeabi/*
armeabi/libGNaviData.so:          ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, BuildID[sha1]=3f711788e7ddd5cfc0e40c9dc21a8c16ff672a1a, stripped
armeabi/libGNaviMap.so:           ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, BuildID[sha1]=b09ef6f2e3e6fe2b8eedddfbe1e0258c9455df69, stripped
armeabi/libGNaviMapex.so:         ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, interpreter /system/bin/linker, BuildID[sha1]=11e8ce5904da6f1e56a9e3d9a81350e28203537b, stripped
armeabi/libGNaviSearch.so:        ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, BuildID[sha1]=64bcf07809a437ef90138de82d35d57c56efe854, stripped
armeabi/libGNaviUtils.so:         ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, BuildID[sha1]=f1967436a33e1eee0c45165b04b5b34161c9956a, stripped
armeabi/libMobGIS.so:             ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, interpreter /system/bin/linker, stripped
armeabi/libRoadLineRebuildAPI.so: ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, BuildID[sha1]=a60f42f83568e2d08040d6463a7228fd66470ee6, stripped
armeabi/libdatabase_sqlcipher.so: ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, stripped
armeabi/libmsc.so:                ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, interpreter /system/bin/linker, stripped
armeabi/libsqlcipher_android.so:  ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, stripped
armeabi/libstlport_shared.so:     ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, interpreter /system/bin/linker, stripped

$ file.exe armeabi-v7a/*
armeabi-v7a/libGNaviData.so:          ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, BuildID[sha1]=a84c1a82b41f6f1ef0773111888b46f48136f165, stripped
armeabi-v7a/libGNaviMap.so:           ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, BuildID[sha1]=6191879978e6223311033307b387666577c54399, stripped
armeabi-v7a/libGNaviMapex.so:         ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, interpreter /system/bin/linker, BuildID[sha1]=609b0caa08bc165b4095be86877aaa5980e7a160, stripped
armeabi-v7a/libGNaviSearch.so:        ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, BuildID[sha1]=ad66ae767567a8b488662bdb5baf340ef517a098, stripped
armeabi-v7a/libGNaviUtils.so:         ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, BuildID[sha1]=03751d929518eb7aec8c23912ac4a4004a0061aa, stripped
armeabi-v7a/libMobGIS.so:             ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, interpreter /system/bin/linker, stripped
armeabi-v7a/libRoadLineRebuildAPI.so: ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, BuildID[sha1]=0c874c2a86d5972f73915dc0988844ab492da06c, stripped
armeabi-v7a/libdatabase_sqlcipher.so: ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, stripped
armeabi-v7a/libmsc.so:                ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, interpreter /system/bin/linker, stripped
armeabi-v7a/libsqlcipher_android.so:  ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, stripped
armeabi-v7a/libstlport_shared.so:     ELF 32-bit LSB shared object ARM, EABI5 version 1 (SYSV), dynamically linked, interpreter /system/bin/linker, stripped


#!/bin/bash -e
#upgrade the project
#################定义变量#######################
instance="tomcat";
target_home="target";
tomcat_dir="/Users/apple/Software/tomcat7";
bak_dir=$tomcat_dir"/bak";
################延时函数########################
function running(){
b=''
for ((i=0;i<=100;i+=2))
do
    printf "progress:[%-50s]%d%%\r" $b $i
    sleep 0.2
    b=#$b
done
echo
}

function resultHandle(){
if [[ $1 -eq 0 ]];
then
    echo "执行成功"
else
    echo $2
fi
}

echo "#############开始更新git ##############";
git pull origin dev;
resultHandle $? "代码更新失败"

echo "############开始执行maven打包##############";
mvn clean
mvn package
resultHandle $? "Maven打包失败"

echo "########开始杀死tomcat进程，请等候5秒####################" ;
ps aux | grep $instance | grep -v grep | awk '{print "kill ",$2|"bash"}' ;
running ;
ps aux | grep $instance | grep -v grep;

echo "###########开始备份###################";
mv ${tomcat_dir}/webapps/isay.war ${bak_dir}/isay__$(date "+%Y%m%d_%H%M").war;
rm -rf ${tomcat_dir}/webapps/isay* ;

echo "#################开始部署程序###################";
cp ${target_home}/*.war ${tomcat_dir}/webapps/isay.war

echo "####重启tomcat...." ;
echo ${tomcat_dir}/bin/startup.sh ;
${tomcat_dir}/bin/startup.sh;

echo "###########查看启动日志#########" ;
running;
tail -f ${tomcat_dir}/logs/catalina.out ;

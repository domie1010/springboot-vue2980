const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmj858g/",
            name: "ssmj858g",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmj858g/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "银行贷款管理系统"
        } 
    }
}
export default base

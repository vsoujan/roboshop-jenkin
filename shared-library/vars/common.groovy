def compile() {
    stage('complie code') {
        if (env.codeType == 'maven') {
            sh '/home/centos/maven/bin/mvn package'
        }

        if (env.codeType == 'nodejs') {
            print 'nodejs'
        }

        if (env.codeType == 'python') {
            print 'python'
        }

        if (env.codeType == 'static') {
            print 'static'
        }
    }

}

def test() {
    stage( 'Test case') {
        print 'Test'
    }
}

def codeQuality() {
    stage( 'Code Quality') {
        print 'Code Quality'
    }
}

def codeSecurity() {
    stage( 'Code security') {
        print 'Code security'
    }
}

def release() {
    stage( 'Release') {
        print 'Release'
    }
}
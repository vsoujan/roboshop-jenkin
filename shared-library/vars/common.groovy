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

def test() {
    stage( 'Code Quality') {
        print 'Code Quality'
    }
}

def test() {
    stage( 'Code security') {
        print 'Code security'
    }
}

def test() {
    stage( 'Release') {
        print 'Release'
    }
}
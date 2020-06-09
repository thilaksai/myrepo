class dockerwar::deploy {

    file {'/home/edureka/docker':
            ensure => directory,
            mode => '0777'
    }

    file {'/home/edureka/docker/target':
            ensure => directory,
            mode => '0777'
    }

    file {'/home/edureka/docker/target/calculator.war':
            mode => '0777',
            source => "puppet:///modules/dockerwar/calculator.war"
    }

    file {'/home/edureka/docker/Dockerfile':
            mode => '0777',
            source => "puppet:///modules/dockerwar/Dockerfile"
    }
    exec {'Docker build':
            cwd => '/home/edureka/docker/',
            command => '/usr/bin/docker build -t calculatorwithwar .'
    }

    exec {'Docker rm':
            cwd => '/home/edureka/docker/',
            command => '/usr/bin/docker rm --force calculator8888 || echo'
    }

    exec {'Docker run':
            cwd => '/home/edureka/docker/',
            command => '/usr/bin/docker run -d -p 8888:8080 --name=calculator8888 calculatorwithwar'
    }
}


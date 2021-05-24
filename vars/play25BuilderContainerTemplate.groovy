def call() {
	return [
		containerTemplate(
			name: 'play25-builder',
			image: 'mozilla/sbt:11.0.8_1.3.13',
	        	alwaysPullImage: false,
			command: 'cat',
			ttyEnabled: true
		)
	]
}

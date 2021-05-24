def call() {
	return [
		containerTemplate(
			name: 'play25-builder',
			image: 'adelabs/play25-builder',
	        	alwaysPullImage: false,
			command: 'cat',
			ttyEnabled: true
		)
	]
}

build-mawino:
	rm -rf build/
	rm -rf dist/
	rm -rf *.spec
	cat build.txt | xargs wine cmd /c

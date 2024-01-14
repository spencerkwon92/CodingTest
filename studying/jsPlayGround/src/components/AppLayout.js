class AppLayout {
  $wrapper = null;
  constructor() {
    const $wrapper = document.createElement("div");
    this.$wrapper = $wrapper;
    this.render();
  }

  render() {
    this.$wrapper.innerHTML = `
      <div>이건 시작이야!!! 좋았어@!!!!!</div>
    `;
  }
}

export default AppLayout;
